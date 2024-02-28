package org.example.ir.ws.dto;


import java.time.LocalDate;

public class PaiementIrDto {
    private Long id;
    private LocalDate datePaiementIr;
    private double totalCotisationPatronal;
    private double totalCotisationSalarial;
    private String month;
    private String year;
    private double totalSalaireBrut;
    private double totalSalaireNet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePaiementIr() {
        return datePaiementIr;
    }

    public void setDatePaiementIr(LocalDate datePaiementIr) {
        this.datePaiementIr = datePaiementIr;
    }

    public double getTotalCotisationPatronal() {
        return totalCotisationPatronal;
    }

    public void setTotalCotisationPatronal(double totalCotisationPatronal) {
        this.totalCotisationPatronal = totalCotisationPatronal;
    }

    public double getTotalCotisationSalarial() {
        return totalCotisationSalarial;
    }

    public void setTotalCotisationSalarial(double totalCotisationSalarial) {
        this.totalCotisationSalarial = totalCotisationSalarial;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getTotalSalaireBrut() {
        return totalSalaireBrut;
    }

    public void setTotalSalaireBrut(double totalSalaireBrut) {
        this.totalSalaireBrut = totalSalaireBrut;
    }

    public double getTotalSalaireNet() {
        return totalSalaireNet;
    }

    public void setTotalSalaireNet(double totalSalaireNet) {
        this.totalSalaireNet = totalSalaireNet;
    }
}

