package aligoldsmith.com.models;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

public class product {
    private String id;
    private String name;
    private double price;
    private boolean isAvailable;
    private String imageurl;

    public product(String id,String name,double price,boolean isAvailable,String imageurl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.imageurl = imageurl;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Override
    public String toString() {
        return "product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        product product = (product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && isAvailable() == product.isAvailable() && getId().equals(product.getId()) && getName().equals(product.getName()) && getImageurl().equals(product.getImageurl());
    }



    public static DiffUtil.ItemCallback<product>itemCallback=new DiffUtil.ItemCallback<product>() {
        @Override
        public boolean areItemsTheSame(@NonNull product oldItem, @NonNull product newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull product oldItem, @NonNull product newItem) {
            return oldItem.equals(newItem);
        }
    };
}
