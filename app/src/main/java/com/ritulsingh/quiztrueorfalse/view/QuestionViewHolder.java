package com.ritulsingh.quiztrueorfalse.view;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ritulsingh.quiztrueorfalse.R;

public class QuestionViewHolder extends RecyclerView.ViewHolder {

    private TextView questionTextView;
    private ImageButton imgButtonTrue;
    private ImageButton imgButtonFalse;

    public QuestionViewHolder(@NonNull View itemView) {
        super(itemView);

        questionTextView = itemView.findViewById(R.id.film_question_text);
        imgButtonTrue = itemView.findViewById(R.id.trueButton);
        imgButtonFalse = itemView.findViewById(R.id.falseButton);

    }

    public TextView getQuestionTextView() {
        return questionTextView;
    }

    public ImageButton getImgButtonTrue() {
        return imgButtonTrue;
    }


    public ImageButton getImgButtonFalse() {
        return imgButtonFalse;
    }
}
