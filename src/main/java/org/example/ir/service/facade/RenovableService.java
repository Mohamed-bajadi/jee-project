package org.example.ir.service.facade;

import org.example.ir.bean.Renovable;
import org.springframework.stereotype.Service;

<<<<<<< HEAD

=======
@Service
>>>>>>> 7d8b199 (ghi kankhrb9u)
public interface RenovableService {
    Renovable findById(Long id);
    int deleteById(Long id);
    int save(Renovable renovable);
}
