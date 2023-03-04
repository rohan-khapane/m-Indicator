package com.example.m_indicator;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class My_MessagingService extends FirebaseMessagingService {
//    private static final int REQ_CODES=100;


    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        showNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());

    }


    public void showNotification(String title,String message) {
//        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.splash_screen_logo, null);
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
//        Bitmap largeIcon = bitmapDrawable.getBitmap();

//
//        Intent iNotify = new Intent(getApplicationContext(), News_page.class);
//        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        PendingIntent pi = PendingIntent.getActivity(this, REQ_CODES, iNotify, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotifications")
                .setSmallIcon(R.drawable.logo_png)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);
//                .setContentIntent(pi)


        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(999, builder.build());


    }




//        Notification Notification;
//        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);

//        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            Notification=new Notification.Builder(this,"MyNotifications")
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon()
//                    .setContentText(message)
//                    .setSubText("New message from raman")
//                    .setContentIntent(pi)
//                    .setChannelId(CHANNEL_ID)
//                    .setContentTitle(title)
//                    .build();
//            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
//        }else{
//            Notification = new Notification.Builder(this,"MyNotifications")
//                    .setLargeIcon(largeIcon)
//                    .setSmallIcon(R.drawable.splash_screen_logo)
//                    .setContentText("message")
//                    .setSubText("New message from raman")
//                    .setContentIntent(pi)
//                    .setContentTitle(title)
//                    .build();
//        }
//        nm.notify(NOTIFICATION_ID,Notification);

    }

//

//
//
//
//

//


