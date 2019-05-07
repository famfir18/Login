package com.example.login.Model;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("status")
    public String  Status;

    @SerializedName("id")
    public String id;

    @SerializedName("firstName")
    public String namaAwal;

    @SerializedName("lastName")
    public String namaAkhir;

    @SerializedName("displayName")
    public String display;

    @SerializedName("email")
    public String mail;

    @SerializedName("token")
    public String tokenn;

}
