package com.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domains.ServiceOrder;
import com.curso.domains.Technician;
import com.curso.domains.Users;
import com.curso.domains.enums.OrderPriority;
import com.curso.domains.enums.OrderStatus;
import com.curso.repositories.ServiceOrderRepository;
import com.curso.repositories.TechnicianRepository;
import com.curso.repositories.UsersRepository;

@Service
public class DBService {

    @Autowired
    private TechnicianRepository techRepo;

    @Autowired
    private UsersRepository userRepo;

    @Autowired
    private ServiceOrderRepository osRepo;

    public void initDB() {

        Technician tech01 = new Technician(null, "Luís", "Prado", "55588822269", "luisfelipe@gmail.com", "123");

        Users user01 = new Users(null, "Jefferson", "Passerini", "89380211755", "jefferson.passerini@gmail.com", "123");

        Users user02 = new Users(null, "João", "Figueredo", "44522136687", "joao.fig@terra.com", "555");

        ServiceOrder os01 = new ServiceOrder(null, "test", "OS test", OrderPriority.HIGH, OrderStatus.OPEN, tech01, user02);

        techRepo.save(tech01);
        userRepo.save(user01);
        userRepo.save(user02);
        osRepo.save(os01);
    }

}
