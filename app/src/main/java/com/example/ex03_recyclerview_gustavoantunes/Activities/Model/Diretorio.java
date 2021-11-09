package com.example.ex03_recyclerview_gustavoantunes.Activities.Model;

public class Diretorio {
    String dirNome;
    String dirModDescricao;
    boolean isDir;

    public Diretorio(String dirNome, String dirModDescricao, boolean isDir) {
        this.dirNome = dirNome;
        this.dirModDescricao = dirModDescricao;
        this.isDir = isDir;
    }

    public String getDirNome() {
        return dirNome;
    }

    public void setDirNome(String dirNome) {
        this.dirNome = dirNome;
    }

    public String getDirModDescricao() {
        return dirModDescricao;
    }

    public void setDirModDescricao(String dirModDescricao) {
        this.dirModDescricao = dirModDescricao;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean dir) {
        isDir = dir;
    }
}
