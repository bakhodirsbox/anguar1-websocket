package uz.unicon.websocket_demo.base;


import org.springframework.stereotype.Service;

@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Override
    public T create(T entity) {
        return null;
    }
}
