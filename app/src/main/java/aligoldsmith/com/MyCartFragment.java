package aligoldsmith.com;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {
    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);
        recyclerView=view.findViewById(R.id.cart_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.chats,"Order1","30","4.3"));
        list.add(new CartModel(R.drawable.chats,"Order2","20","4.6"));
        list.add(new CartModel(R.drawable.chats,"Order3","40","4.4"));
        list.add(new CartModel(R.drawable.chats,"Order4","30","4.3"));
        list.add(new CartModel(R.drawable.chats,"Order5","50","4.3"));
        list.add(new CartModel(R.drawable.chats,"Order6","60","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        return view;

    }
}