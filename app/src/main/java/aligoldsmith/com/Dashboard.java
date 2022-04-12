package aligoldsmith.com;


import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import aligoldsmith.com.Views.ShopActivity;

public class Dashboard extends Fragment implements OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        CardView about = (CardView) getActivity().findViewById(R.id.aboutus);
        CardView category = (CardView) getActivity().findViewById(R.id.Category);
        CardView contact = (CardView) getActivity().findViewById(R.id.Contact);
        CardView review = (CardView) getActivity().findViewById(R.id.cardreview);
        CardView cart = (CardView) getActivity().findViewById(R.id.addTOcart);
        CardView shop = (CardView) getActivity().findViewById(R.id.Shop);


        about.setOnClickListener(this);
        category.setOnClickListener(this);
        contact.setOnClickListener(this);
        review.setOnClickListener(this);
        cart.setOnClickListener(this);
        shop.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aboutus:
                Intent intent = new Intent(getActivity(), aboutuspage.class);
                startActivity(intent);
                break;
            case R.id.Category:
                Intent i = new Intent(getActivity(), Categories.class);
                startActivity(i);

                break;
            case R.id.Contact:
                Intent in = new Intent(getActivity(), ContactUs.class);
                startActivity(in);

                break;
            case R.id.cardreview:
                Intent inte = new Intent(getActivity(), Review.class);
                startActivity(inte);

                break;
            case R.id.addTOcart:
                Intent myIntent = new Intent(v.getContext(), ActivityCart.class);
                startActivity(myIntent);

                break;
            case R.id.Shop:
                Intent iIntent = new Intent(v.getContext(), ShopActivity.class);
                startActivity(iIntent);

                break;



        }

    }
}
