import axios from "axios";
import React, { useContext, createContext,  useState, useEffect } from "react";

const TodoStateContext = createContext();
const TodoDispatchContext = createContext();

export function TodoProvider({ children }) {
    
    const [todos, setTodos] = useState([]);

    useEffect(() => {
        // 비동기 함수 선언
        const fetchTodos = async () => {
            try {
                const response = await axios.get('/api/get');
                setTodos(response.data);
            } catch (error) {
                console.error("todo 목록을 가져오지 못함:", error);
            }
        };

        fetchTodos();
    }, []);

    const dispatch = (action) => {
        switch (action.type) {
            case 'CREATE':
                setTodos([...todos, action.todo]);
                break;
            case 'TOGGLE':
                setTodos(todos.map(todo =>
                    todo.id === action.id ? { ...todo, done: !todo.done } : todo
                ));
                break;
            case 'REMOVE':
                setTodos(todos.filter(todo => todo.id !== action.id));
                break;
            default:
                break;
        }
    };

    
    return (
        <TodoStateContext.Provider value={todos}>
            <TodoDispatchContext.Provider value={dispatch}>
                {children}
            </TodoDispatchContext.Provider>
        </TodoStateContext.Provider>
    );
}

export function useTodoState() {
    const context = useContext(TodoStateContext);
    if (!context) {
        throw new Error('Cannot find TodoProvider');
    }
    
    return context;
}

export function useTodoDispatch() {
    const context = useContext(TodoDispatchContext);
    if (!context) {
        throw new Error('Cannot find TodoProvider');
    }

    return context;
}