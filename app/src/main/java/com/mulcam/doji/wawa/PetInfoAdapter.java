package com.mulcam.doji.wawa;

/**
 * Created by DongJinPark on 2017-06-07.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by student on 2017-06-05.
 */

public class PetInfoAdapter extends ArrayAdapter<PetInfo>{
    private Context context;
    private int resource;
    private List<PetInfo> petInfoList;

    public PetInfoAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<PetInfo> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.petInfoList = objects;
    }

    static class PetInfoViewHolder{
        public ImageView petImg;
        public TextView petNameTv;
        public TextView petResistTv;
        public TextView petKindTv;
        public TextView petSexTv;
        public TextView petNeutralTv;
        public TextView petBirthdayTv;
        public TextView petDogAgeTv;
        public TextView petPeopleAgeTv;
        public TextView petWeightTv;
        public TextView petAverWeightTv;
        public TextView petCalorieTv;
        public TextView petExerciseTv;
        public TextView petBeautyTv;
        public TextView petMedicalTv;
    }

    public List<PetInfo> getPersonList() {
        return petInfoList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        PetInfoViewHolder holder = null;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resource, parent, false);

            holder = new PetInfoViewHolder();

            holder.petImg = (ImageView) convertView.findViewById(R.id.mypet_img);
            holder.petNameTv = (TextView) convertView.findViewById(R.id.mypet_name);
            holder.petResistTv = (TextView) convertView.findViewById(R.id.mypet_resist);
            holder.petKindTv = (TextView) convertView.findViewById(R.id.mypet_kind);
            holder.petSexTv = (TextView) convertView.findViewById(R.id.mypet_sex);
            holder.petNeutralTv = (TextView) convertView.findViewById(R.id.mypet_neutral);
            holder.petBirthdayTv = (TextView) convertView.findViewById(R.id.mypet_birth);
            holder.petDogAgeTv = (TextView) convertView.findViewById(R.id.mypet_dog_age);
            holder.petPeopleAgeTv = (TextView) convertView.findViewById(R.id.mypet_people_age);
            holder.petWeightTv = (TextView) convertView.findViewById(R.id.mypet_weight);
            holder.petAverWeightTv = (TextView) convertView.findViewById(R.id.mypet_average_weight);
            holder.petCalorieTv = (TextView) convertView.findViewById(R.id.mypet_calorie);
            holder.petExerciseTv = (TextView) convertView.findViewById(R.id.mypet_exercise);
            holder.petBeautyTv = (TextView) convertView.findViewById(R.id.mypet_beauty);
            holder.petMedicalTv = (TextView) convertView.findViewById(R.id.mypet_medical);


            convertView.setTag(holder);
        }
        else{
            holder = (PetInfoViewHolder) convertView.getTag();
        }

        final PetInfo petInfo = petInfoList.get(position);
        holder.petNameTv.setText(petInfo.getName());
        holder.petResistTv.setText("(등록번호: " + petInfo.getResist() + ")");
        holder.petKindTv.setText(petInfo.getKind());
        holder.petSexTv.setText(petInfo.getSex());
        holder.petNeutralTv.setText("중성화여부: " + petInfo.getNeutral());
        holder.petBirthdayTv.setText("생일: " + petInfo.getBirthday()+"");
        holder.petDogAgeTv.setText("??년 ??개월");
        holder.petPeopleAgeTv.setText("사람나이 ??살");
        holder.petWeightTv.setText(petInfo.getWeight()+"kg");
        holder.petAverWeightTv.setText("해당견종 성견 평균무게 ??kg");
        holder.petCalorieTv.setText("(기본)하루 필요열량 ???kcal");
        holder.petExerciseTv.setText("??견 평균 일일 운동 권장량: ?? ~ ??분");
        holder.petBeautyTv.setText("미용 주기 알림 D-???");
        holder.petMedicalTv.setText("다음 예방 접종 시기[종합백신] D-???");

        return convertView;
    }
}
