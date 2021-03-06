/*
 * Copyright (C), 2019. by [clock - Individual developer] ,All rights reserved.
 * The article is original, writing is also the strength to live, reference please indicate the source and author.
 */

package com.clock.bluetoothlib.logic.network.data;

public final class BLEPacket {

    /**
     * 数据
     */
    public byte[] bleData;
    /**
     * ble id 标志不同的蓝牙设备，也就是设备的mDeviceId
     */
    public int bleDeviceId;

    public BLEPacket(byte[] data, int id) {
        bleData = data;
        bleDeviceId = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BLEPacket{");
        sb.append("bleData=");
        if (bleData == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < bleData.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(bleData[i]);
            sb.append(']');
        }
        sb.append(", bleAddr='").append(bleDeviceId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
