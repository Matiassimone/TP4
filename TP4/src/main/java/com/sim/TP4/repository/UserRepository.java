package com.sim.TP4.repository;

import com.sim.TP4.models.UserData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;


@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {


    @Query(value = "SELECT U.BROWSER FROM USER_DATA U GROUP BY (U.BROWSER)" +
            " HAVING COUNT(U.BROWSER)  = (" +
            "SELECT COUNT(U.BROWSER) FROM USER_DATA U GROUP BY U.BROWSER ORDER BY COUNT(U.BROWSER) " +
            "DESC LIMIT 1)", nativeQuery = true)
    ArrayList mostUtilizedBrowser();


    @Query(value = "SELECT U.OPERATIVE_SYSTEM FROM USER_DATA U GROUP BY (U.OPERATIVE_SYSTEM)" +
            " HAVING COUNT(U.OPERATIVE_SYSTEM)  = (" +
            "SELECT COUNT(U.OPERATIVE_SYSTEM) FROM USER_DATA U GROUP BY U.OPERATIVE_SYSTEM ORDER BY COUNT(U.OPERATIVE_SYSTEM) " +
            "DESC LIMIT 1) ", nativeQuery = true)
    ArrayList mostUtilizedOperativeSystem();


    @Query(value = "SELECT U.OS_AND_BROWSER FROM USER_DATA U GROUP BY (U.OS_AND_BROWSER)" +
            "HAVING COUNT(U.OS_AND_BROWSER)  = (" +
            "SELECT COUNT(U.OS_AND_BROWSER) FROM USER_DATA U GROUP BY U.OS_AND_BROWSER ORDER BY COUNT(U.OS_AND_BROWSER) " +
            "DESC LIMIT 1)", nativeQuery = true)
    ArrayList mostUtilizedBrowserAndOs();
}

/*
Ordenar las carpetas y sus funciones para que estas correspondan bien al modelo MVC
hacer la parte de teoria
Y LISTOOO
 */
