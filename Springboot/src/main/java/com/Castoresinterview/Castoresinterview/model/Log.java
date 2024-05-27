package com.Castoresinterview.Castoresinterview.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "Logs")
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_Logs")
  private int idLogs;

  @Column(name = "Query")
  private String query;

  @Column(name = "Timestamp")
  private Timestamp timestamp;

  @Column(name = "Datetime")
  private LocalDateTime datetime;
  @Column(name = "id_Usuario")
  private int idUsuario;
  public Log(){

  }

  public Log(int idLogs, String query, Timestamp timestamp, LocalDateTime datetime, int idUsuario) {
    this.idLogs = idLogs;
    this.query = query;
    this.timestamp = timestamp;
    this.datetime = datetime;
    this.idUsuario = idUsuario;
  }

  public int getIdLogs() {
    return idLogs;
  }

  public void setIdLogs(int idLogs) {
    this.idLogs = idLogs;
  }

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public LocalDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDateTime datetime) {
    this.datetime = datetime;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }
}
