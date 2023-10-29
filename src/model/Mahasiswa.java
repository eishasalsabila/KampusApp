package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    private int idProdi;
    public int getIdProdi() {
        return idProdi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, int idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;
    }

    public class Prodi {
        private int id;
        private String nama;
    
        public Prodi(int id, String nama) {
            this.id = id;
            this.nama = nama;
        }
    
        public int getId() {
            return id;
        }
    
        public String getNama() {
            return nama;
        }
    }
}