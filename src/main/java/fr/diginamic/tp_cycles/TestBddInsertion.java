package fr.diginamic.tp_cycles;


import fr.diginamic.tp_cycles.bll.BLLException;
import fr.diginamic.tp_cycles.bll.ObjectManager;
import fr.diginamic.tp_cycles.domain.ClientVelo;
import fr.diginamic.tp_cycles.domain.Gyropode;
import fr.diginamic.tp_cycles.domain.Gyroroue;
import fr.diginamic.tp_cycles.domain.Velo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestBddInsertion {

    public static void main(String[] args) throws BLLException {

        //Client

        ClientVelo client = new ClientVelo("Dupont", "Jean", 182, 356);
        //ObjectManager.getInstance().addObject(client);

        //Velo

        LocalDate date = LocalDate.of(2019, 1, 1);
        Velo velo = new Velo("Decathlon", "VTC", date, BigDecimal.valueOf(100), true, "Triple plateau", 5, client);
        ObjectManager.getInstance().addObject(velo);

        //Gyroroue

        LocalDate date2 = LocalDate.of(2019, 1, 2);
        Gyroroue gyroroue = new Gyroroue("Decathlon", "VTC", date2, BigDecimal.valueOf(150), true, 120, client);
        ObjectManager.getInstance().addObject(gyroroue);

        //Gyropode

        LocalDate date3 = LocalDate.of(2019, 1, 3);
        Gyroroue gyropode = new Gyropode("Btwin", "Hoverboard", date3, 250, client, BigDecimal.valueOf(364), true, 150);
        ObjectManager.getInstance().addObject(gyropode);

    }
}
