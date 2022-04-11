package com.example.produk.model;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Produk implements Parcelable {
    private long id;
    private String namaProduct;
    private int hargaProduct;
    private String deskripsiProduct;
    private String categoryProduct;
    private String gambarProduct;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.namaProduct);
        dest.writeInt(this.hargaProduct);
        dest.writeString(this.deskripsiProduct);
        dest.writeString(this.categoryProduct);
        dest.writeString(this.gambarProduct);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readLong();
        this.namaProduct = source.readString();
        this.hargaProduct = source.readInt();
        this.deskripsiProduct = source.readString();
        this.categoryProduct = source.readString();
        this.gambarProduct = source.readString();
    }

    protected Produk(Parcel in) {
        this.id = in.readLong();
        this.namaProduct = in.readString();
        this.hargaProduct = in.readInt();
        this.deskripsiProduct = in.readString();
        this.categoryProduct = in.readString();
        this.gambarProduct = in.readString();
    }

    public static final Parcelable.Creator<Produk> CREATOR = new Parcelable.Creator<Produk>() {
        @Override
        public Produk createFromParcel(Parcel source) {
            return new Produk(source);
        }

        @Override
        public Produk[] newArray(int size) {
            return new Produk[size];
        }
    };
}
