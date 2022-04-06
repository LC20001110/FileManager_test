package com.example.filemanager.Activity;

import android.content.Context;
import android.content.Intent;

import android.util.Log;
import android.view.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.filemanager.Adapter.FileViewAdapter;
import com.example.filemanager.FileView;
import com.example.filemanager.ItemTouchCallBack;
import com.example.filemanager.R;
import com.example.filemanager.Utils.DensityUtil;
import com.example.filemanager.Utils.FileManagerUtils;
import com.example.filemanager.Utils.GetFilesUtils;
import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filemanager.FileView;
import com.example.filemanager.ItemTouchCallBack;
import com.example.filemanager.R;
import com.example.filemanager.Utils.FileManagerUtils;
import com.example.filemanager.Utils.GetFilesUtils;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;

import com.example.filemanager.R;

import org.apache.commons.io.FilenameUtils;

public class TestActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    EditText edit;
    private LinearLayout mGoBackLinearLayout;
    private TextView mFileTextView;
    private TextView mVideoTextView;
    private TextView mAudioTextView;
    private TextView mOtherTextView;
    private TextView mMobileMemoryTextView;
    private TextView mSDCardTextView;
    private LinearLayout mSDCardLinearLayout;
    String Choice;
    private String mSDCardPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.file_manager);
        mGoBackLinearLayout = (LinearLayout) findViewById(R.id.rc_ac_ll_go_back);
        mFileTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_file);
        mVideoTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_video);
        mAudioTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_audio);
        mOtherTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_picture);
        mMobileMemoryTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_mobile_memory);
        mSDCardTextView = (TextView) findViewById(R.id.rc_ac_tv_file_manager_SD_card);
        mSDCardLinearLayout = (LinearLayout)findViewById(R.id.rc_ac_ll_sd_card);


        //为button绑定事件
        mFileTextView.setOnClickListener(new View.OnClickListener() {
            //String Choice="mFileTextView";
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(TestActivity.this, DivideActivity.class);
                DivideActivity.Choice="mFileTextView";
                startActivity(intent);
            }
        });
        mVideoTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, DivideActivity.class);
                DivideActivity.Choice="mVideoTextView";
                startActivity(intent);
            }
        });
        mAudioTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, DivideActivity.class);
                DivideActivity.Choice="mAudioTextView";
                startActivity(intent);
            }
        });
        mOtherTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, DivideActivity.class);
                DivideActivity.Choice="mOtherTextView";
                startActivity(intent);
            }
        });
        mMobileMemoryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });







    }


}