package com.touchizen.drawerwithbottomnavigation.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.touchizen.drawerwithbottomnavigation.ComplaintCardActivity;
import com.touchizen.drawerwithbottomnavigation.ContactTeamCardActivity;
import com.touchizen.drawerwithbottomnavigation.EmergencyNumberCardActivity;
import com.touchizen.drawerwithbottomnavigation.FacilitiesCardActivity;
import com.touchizen.drawerwithbottomnavigation.GalleryCardActivity;
import com.touchizen.drawerwithbottomnavigation.MarketplaceCardActivity;
import com.touchizen.drawerwithbottomnavigation.MemberCardActivity;
import com.touchizen.drawerwithbottomnavigation.MyProfileCardActivity;
import com.touchizen.drawerwithbottomnavigation.ParkingCardActivity;
import com.touchizen.drawerwithbottomnavigation.R;
import com.touchizen.drawerwithbottomnavigation.ServiceProviderCardActivity;
import com.touchizen.drawerwithbottomnavigation.SliderAdapter;
import com.touchizen.drawerwithbottomnavigation.SosCardActivity;
import com.touchizen.drawerwithbottomnavigation.VisitorsCardActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private CardView member_card, visitor_card, parking_card,complaint_card,facilities_card,
                    emergency_card,serviceprovider_card,sos_card,marketplace_card,
                    myprofile_card,gallery_card,conactteam_card, card_relative;
    SliderView sliderView;
    int[] images = {R.drawable.ss1,
            R.drawable.ss2,
            R.drawable.ss3,
            R.drawable.ss4,
            R.drawable.ss5,
            R.drawable.ss6,
            R.drawable.ss7};


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        member_card = root.findViewById(R.id.membercard);
        visitor_card = root.findViewById(R.id.visitorcard);
        parking_card = root.findViewById(R.id.parkingcard);
        complaint_card = root.findViewById(R.id.complaintcard);
        facilities_card = root.findViewById(R.id.facilitiescard);
        emergency_card = root.findViewById(R.id.emergencynumbercard);
        serviceprovider_card = root.findViewById(R.id.serviceprovider);
        sos_card = root.findViewById(R.id.soscard);
        marketplace_card = root.findViewById(R.id.marketplacecard);
        myprofile_card = root.findViewById(R.id.myprofilecard);
        gallery_card = root.findViewById(R.id.gallerycard);
        conactteam_card = root.findViewById(R.id.contactteamcard);
        card_relative = root.findViewById(R.id.card1);

        sliderView = root.findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();



        member_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MemberCardActivity.class);
                startActivity(i);
            }
        });

        visitor_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), VisitorsCardActivity.class);
                startActivity(i);
            }
        });

        parking_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ParkingCardActivity.class);
                startActivity(i);
            }
        });


        complaint_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ComplaintCardActivity.class);
                startActivity(i);
            }
        });


        facilities_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), FacilitiesCardActivity.class);
                startActivity(i);
            }
        });


        emergency_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), EmergencyNumberCardActivity.class);
                startActivity(i);
            }
        });



        serviceprovider_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ServiceProviderCardActivity.class);
                startActivity(i);
            }
        });


        sos_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), SosCardActivity.class);
                startActivity(i);
            }
        });


        marketplace_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MarketplaceCardActivity.class);
                startActivity(i);
            }
        });


        myprofile_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MyProfileCardActivity.class);
                startActivity(i);
            }
        });


        gallery_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), GalleryCardActivity.class);
                startActivity(i);
            }
        });


        conactteam_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ContactTeamCardActivity.class);
                startActivity(i);
            }
        });


        return root;
    }

}