package com.znergy;

import org.sql2o.Connection;

import java.util.List;

/**
 * Created by ryanjones on 3/31/17.
 */
public class Client {
  private int id;
  private String name;
  private String description;
  private int id_stylist;

  public Client(String name, String description, int id_stylist) {
    this.name = name;
    this.description = description;
    this.id_stylist = id_stylist;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getId_stylist() {
    return id_stylist;
  }

  public static List<Client> all() {
    try (Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM clients";
      return con.createQuery(sql).executeAndFetch(Client.class);
    }
  }

  public void save() {
    try (Connection con = DB.sql2o.open()) {
      String sql = "INSERT INTO clients (name, description, id_stylist) VALUES (:name, :description, :id_stylist);";
      this.id = (int) con.createQuery(sql, true)
              .addParameter("name", this.name)
              .addParameter("description", this.description)
              .addParameter("id_stylist", this.id_stylist)
              .executeUpdate()
              .getKey();
    }
  }

  public void update(String name, String description, int id_stylist) {
    try (Connection con = DB.sql2o.open()) {
      String sql = "UPDATE clients SET name = :name, description = :description, id_stylist = :id_stylist WHERE id " +
              "= :id;";
      con.createQuery(sql)
              .addParameter("name", name)
              .addParameter("description", description)
              .addParameter("id_stylist", id_stylist)
              .addParameter("id", this.id)
              .executeUpdate();
    }
  }

  public void delete() {
    try (Connection con = DB.sql2o.open()) {

    }
  }

  public static Client find(int id) {
    try (Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM clients WHERE id = :id;";
      Client client = con.createQuery(sql)
              .addParameter("id", id)
              .executeAndFetchFirst(Client.class);
      return client;
    }
  }
}
