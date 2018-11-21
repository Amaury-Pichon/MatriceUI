package fr.wildcodeschool.matriceui2;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle(R.string.title);

        LinearLayout lMainLayout = (LinearLayout) findViewById((R.id.mainLinearLayout));


        TextView lTeaserText = new TextView(this);
        lTeaserText.setText(R.string.teaser_text);
        lTeaserText.setBackgroundColor(Color.parseColor("#ff4081"));
        lTeaserText.setTextColor(Color.parseColor("#6e1b37"));
        lTeaserText.setTextSize(20);
        lTeaserText.setPadding(convertDpToPx(10), convertDpToPx(5),convertDpToPx(10), convertDpToPx(5));
        LinearLayout.LayoutParams lTeaserTextParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lTeaserTextParams.setMargins(0, convertDpToPx(10), 0, convertDpToPx(10));
        lTeaserText.setLayoutParams(lTeaserTextParams);

        CheckBox lCheckbox = new CheckBox(this);
        lCheckbox.setText(R.string.checkbox);
        LinearLayout.LayoutParams lCheckboxParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lCheckboxParams.gravity = Gravity.CENTER_HORIZONTAL;
        lCheckbox.setLayoutParams(lCheckboxParams);

        LinearLayout firstNameLayout = new LinearLayout(this);
        firstNameLayout.setOrientation(LinearLayout.HORIZONTAL);
        firstNameLayout.setWeightSum(2);
        LinearLayout.LayoutParams firstNameLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        firstNameLayout.setLayoutParams(firstNameLayoutParams);

        EditText firstName = new EditText(this);
        firstName.setEms(10);
        firstName.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        firstName.setHint(R.string.firstname_hint);
        LinearLayout.LayoutParams firstNameParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1.0f);
        firstName.setLayoutParams(firstNameParams);

        Space firstNameSpace = new Space(this);
        LinearLayout.LayoutParams firstNameSpaceParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                10f);
        firstNameSpace.setLayoutParams(firstNameSpaceParams);

        firstNameLayout.addView(firstName);
        firstNameLayout.addView(firstNameSpace);

        LinearLayout lastNameLayout = new LinearLayout(this);
        lastNameLayout.setOrientation(LinearLayout.HORIZONTAL);
        lastNameLayout.setWeightSum(2);
        LinearLayout.LayoutParams lastNameLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lastNameLayout.setLayoutParams(lastNameLayoutParams);

        EditText lastName = new EditText(this);
        lastName.setEms(10);
        lastName.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        lastName.setHint(R.string.lastname_hint);
        LinearLayout.LayoutParams lastNameParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1.0f);
        lastName.setLayoutParams(lastNameParams);

        Space lastNameSpace = new Space(this);
        LinearLayout.LayoutParams lastNameSpaceParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1.0f);
        lastNameSpace.setLayoutParams(lastNameSpaceParams);

        lastNameLayout.addView(lastName);
        lastNameLayout.addView(lastNameSpace);

        Button validate = new Button(this);
        validate.setText(R.string.button_validate);
        LinearLayout.LayoutParams validateParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        validate.setLayoutParams(validateParams);


        lMainLayout.addView(lTeaserText);
        lMainLayout.addView(lCheckbox);
        lMainLayout.addView(firstNameLayout);
        lMainLayout.addView(lastNameLayout);
        lMainLayout.addView(validate);

    }



    public int convertDpToPx(float dp){
        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return (int) px;
    }
}