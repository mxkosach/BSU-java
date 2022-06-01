package by.bsu.lab4a.main;

import by.bsu.lab4a.action.PuppyOperator;
import by.bsu.lab4a.entity.Puppy;
import by.bsu.lab4a.exception.FileException;
import by.bsu.lab4a.reader.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.System.in;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws FileNotFoundException, FileException {
        try {
            //Puppy puppy=new Puppy("Charlie",2,POODLE);
            DataReader dataReader = new DataReader();
            Puppy puppy = new Puppy();
            String fname = "src/main/resources/data/puppy.txt";
            puppy = dataReader.readFromFile(fname);
            logger.info(puppy);
            PuppyOperator puppyOperator = new PuppyOperator();
            logger.info(puppyOperator.writeName(puppy));
            logger.info(puppyOperator.bite(puppy));
            logger.info(puppyOperator.jump(puppy));
            logger.info(puppyOperator.bark(puppy));
            logger.info(puppyOperator.run(puppy));
        } catch (OutOfMemoryError E) {
            logger.error("Ошибка нехватки памяти");
        } catch (IllegalArgumentException E) {
            logger.error("Ошибка недопустимости значения поля");
        } catch (FileNotFoundException e) {
            logger.error("Ошибка открытия файла ");
        }
    }
}
