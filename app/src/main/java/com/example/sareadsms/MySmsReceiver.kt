/*
package com.example.sareadsms

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsMessage
import android.widget.Toast

class MySmsReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context,"RECEIVED AN SMS",Toast.LENGTH_LONG).show()

        var bundle : Bundle? = intent?.extras

        if(bundle != null) {
            var data = bundle.get("pdus")

            var currentmessage = SmsMessage.createFromPdu(data as ByteArray)
            var senderPhone = currentmessage.displayOriginatingAddress

            var messageBody = currentmessage.displayMessageBody


            Toast.makeText(context,"RECEIVED AN SMS  $senderPhone WITH TEXT : $messageBody ",Toast.LENGTH_LONG).show()

        }
    }
}*/
