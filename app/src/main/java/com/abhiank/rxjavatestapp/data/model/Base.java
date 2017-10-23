
package com.abhiank.rxjavatestapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Base {

    @SerializedName("label")
    @Expose
    String label;
    @SerializedName("ref")
    @Expose
    String ref;
    @SerializedName("sha")
    @Expose
    String sha;
    @SerializedName("user")
    @Expose
    User user;
    @SerializedName("repo")
    @Expose
    Repo repo;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

}
