package com.znergy;

/**
 * Created by ryanjones on 3/31/17.
 */
import org.sql2o.*;

public class DB {
  public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hair_salon", null, null);
}
