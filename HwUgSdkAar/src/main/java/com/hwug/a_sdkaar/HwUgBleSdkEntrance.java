package com.hwug.a_sdkaar;

import android.content.Context;

import androidx.annotation.Keep;

import com.ble.support.UgBleFactory;
import com.ble.support.entity.BleDevice;
import com.ugee.pentabletinterfacelibrary.ITabletDataCallback;

@Keep
public final class HwUgBleSdkEntrance {

    public void connect(Context context, BleDevice bleDevice,ITabletDataCallback iTabletDataCallback){
        UgBleFactory.getInstance().connect(context,bleDevice,iTabletDataCallback);
    }

    //
    public void disconnect(){
        UgBleFactory.getInstance().disConnect();
    }

}
