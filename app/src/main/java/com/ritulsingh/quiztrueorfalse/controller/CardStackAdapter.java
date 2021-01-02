package com.ritulsingh.quiztrueorfalse.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ritulsingh.quiztrueorfalse.R;
import com.ritulsingh.quiztrueorfalse.model.QuizQuestion;
import com.ritulsingh.quiztrueorfalse.view.QuestionViewHolder;

import java.util.List;

public class CardStackAdapter extends RecyclerView.Adapter<QuestionViewHolder> {

    private Context mContext;
    private List<QuizQuestion> mQuestionNames;
    private LayoutInflater mLayoutInflater;

    public CardStackAdapter(Context context, List<QuizQuestion> questionNames){
        mContext = context;
        mQuestionNames = questionNames;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public QuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.question_view, parent, false);
        return new QuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionViewHolder holder, int position) {

        holder.getQuestionTextView().setText(mQuestionNames.get(position).getQuizQuestion());
        holder.getImgButtonTrue().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "True is Tapped", Toast.LENGTH_SHORT).show();
                if (mQuestionNames.get(position).isTrueAnswer()){
                    Toast.makeText(mContext, "You have answered correctly, Congratulation!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(mContext, "Sorry. You were wrong answer, try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        holder.getImgButtonFalse().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mQuestionNames.get(position).isTrueAnswer()){
                    Toast.makeText(mContext, "Sorry. You were wrong answer, try again", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(mContext, "You have answered correctly, Congratulation!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mQuestionNames.size();
    }
}