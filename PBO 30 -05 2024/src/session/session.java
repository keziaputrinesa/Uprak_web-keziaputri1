/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

/**
 *
 * @author HP
 */
public class session {
  private static int id;
  private static String nama_lengkap,alamat,no_hp,username,password;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        session.id = id;
    }

    public static String getNama_lengkap() {
        return nama_lengkap;
    }

    public static void setNama_lengkap(String nama_lengkap) {
        session.nama_lengkap = nama_lengkap;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        session.alamat = alamat;
    }

    public static String getNo_hp() {
        return no_hp;
    }

    public static void setNo_hp(String no_hp) {
        session.no_hp = no_hp;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        session.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        session.password = password;
    }

}
