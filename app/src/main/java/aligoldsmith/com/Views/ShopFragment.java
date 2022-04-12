package aligoldsmith.com.Views;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import aligoldsmith.com.R;
import aligoldsmith.com.adapters.ShopListAdapter;
import aligoldsmith.com.databinding.FragmentShopBinding;
import aligoldsmith.com.models.product;


public class ShopFragment extends Fragment implements ShopListAdapter.ShopInterface{
    FragmentShopBinding fragmentShopBinding;
   private ShopListAdapter shopListAdapter;

    public ShopFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentShopBinding = FragmentShopBinding.inflate(inflater,container,false);
        return fragmentShopBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopListAdapter = new ShopListAdapter();
        fragmentShopBinding.recyclerView.setAdapter(shopListAdapter);
    }

    @Override
    public void addItem(product product) {

    }

    @Override
    public void onItemClick(product product) {

    }
}