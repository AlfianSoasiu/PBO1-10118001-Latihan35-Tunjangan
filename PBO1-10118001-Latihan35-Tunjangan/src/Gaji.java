
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Membuat subclass tunjangan
 */
public class Gaji {
    
    Scanner sc = new Scanner(System.in);
	private double pokok, tunjangan, total;
	private String status;
	
	public void inputAwal(){
		System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
		pokok = sc.nextDouble();
		System.out.print("Status anda? (Menikah/Belum) : ");
		status = sc.next();
	}
	
	public void outputAkhir(){
		hitungTotal();
		System.out.println("=====Hasil Perhitungan Gaji Anda=====");
		System.out.println("Gaji Pokok : Rp."+pokok);
		System.out.println("Tunjangan  : Rp."+tunjangan);
		System.out.println("Total Gaji : Rp."+total);
	}
	
	private void hitungTunjangan(){
		tunjangan = (status.equalsIgnoreCase("Menikah") ? 0.35*pokok : 0);
	}
	
	private void hitungTotal(){
		hitungTunjangan();
		total = tunjangan+pokok;
	}
}
