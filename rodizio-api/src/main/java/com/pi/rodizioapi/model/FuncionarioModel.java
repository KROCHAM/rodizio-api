    package com.pi.rodizioapi.model;

    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.Id;
    import java.io.Serializable;

    @Entity(name = "funcionarios")
    public class FuncionarioModel implements Serializable {
        @Id
        @GeneratedValue
        public long id;

        @Column(nullable = false)
        public String nome;

        @Column(nullable = false, unique = true)
        public String matricula;

        @Column(nullable = false)
        public String setor;

        @Column(nullable = false)
        public String senha;


        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getSetor() {
            return setor;
        }

        public void setSetor(String setor) {
            this.setor = setor;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

    }
