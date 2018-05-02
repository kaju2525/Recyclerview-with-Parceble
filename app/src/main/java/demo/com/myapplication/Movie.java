package demo.com.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Movie implements Parcelable {
    private String title;
    private int year;
    private int image;


    public Movie(String title, int year,int image) {
        this.title = title;
        this.year = year;
        this.image = image;
    }

    protected Movie(Parcel in) {
        title = in.readString();
        year = in.readInt();
        image = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(year);
        dest.writeInt(image);
    }
}