/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Daftar Film berbasis object
 */
public class PBOULG10115557Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Film f = new Film();
        System.out.println("=== Daftar Film Sedang Tayang ===");
        
        f.filmNama="Venom";
        f.filmGenre="Action, Horror, Sci-fi";
        f.filmRating=8.5;
        f.filmDuration=120;
        f.nowPlaying();
        
        f.filmNama="small foot";
        f.filmGenre="Animation";
        f.filmRating=9.0;
        f.filmDuration=96;
        f.nowPlaying();
        
        f.filmNama="Crazy Rich Asian";
        f.filmGenre="Comedy";
        f.filmRating=7.8;
        f.filmDuration=119;
        f.nowPlaying();
        
        f.filmNama="Asih";
        f.filmGenre="Horror";
        f.filmRating=6.0;
        f.filmDuration=100;
        f.nowPlaying();
    }
    
}
