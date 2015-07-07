package com.example.btcheck;

import android.bluetooth.BluetoothClass;

public class BTClassResolver {

	public static String resolveDeviceClass(int btClass){
		switch (btClass){
		case BluetoothClass.Device.AUDIO_VIDEO_CAMCORDER:
			return "Audio/Video, Camcorder";
		case BluetoothClass.Device.AUDIO_VIDEO_CAR_AUDIO:
			return "Audio/Video, Car Audio";
		case BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE:
			return "Audio/Video, Handsfree";
		case BluetoothClass.Device.AUDIO_VIDEO_HEADPHONES:
			return "Audio/Video, Headphones";
		case BluetoothClass.Device.AUDIO_VIDEO_HIFI_AUDIO:
			return "Audio/Video, HiFi Audio";
		case BluetoothClass.Device.AUDIO_VIDEO_LOUDSPEAKER:
			return "Audio/Video, Loudspeaker";
		case BluetoothClass.Device.AUDIO_VIDEO_MICROPHONE:
			return "Audio/Video, Microphone";
		case BluetoothClass.Device.AUDIO_VIDEO_PORTABLE_AUDIO:
			return "Audio/Video, Portable Audio";
		case BluetoothClass.Device.AUDIO_VIDEO_SET_TOP_BOX:
			return "Audio/Video, Set Top Box";
		case BluetoothClass.Device.AUDIO_VIDEO_UNCATEGORIZED:
			return "Audio/Video, Uncategorized";
		case BluetoothClass.Device.AUDIO_VIDEO_VCR:
			return "Audio/Video, VCR";
		case BluetoothClass.Device.AUDIO_VIDEO_VIDEO_CAMERA:
			return "Audio/Video, Video Camera";
		case BluetoothClass.Device.AUDIO_VIDEO_VIDEO_CONFERENCING:
			return "Audio/Video, Video Conferencing";
		case BluetoothClass.Device.AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER:
			return "Audio/Video, Video Display and Loudspeaker";
		case BluetoothClass.Device.AUDIO_VIDEO_VIDEO_GAMING_TOY:
			return "Audio/Video, Video Gaming Toy";
		case BluetoothClass.Device.AUDIO_VIDEO_VIDEO_MONITOR:
			return "Audio/Video, Video Monitor";
		case BluetoothClass.Device.AUDIO_VIDEO_WEARABLE_HEADSET:
			return "Audio/Video, Video Wearable Headset";
		case BluetoothClass.Device.COMPUTER_DESKTOP:
			return "Computer, Desktop";
		case BluetoothClass.Device.COMPUTER_HANDHELD_PC_PDA:
			return "Computer, Handheld PC/PDA";
		case BluetoothClass.Device.COMPUTER_LAPTOP:
			return "Computer, Laptop";
		case BluetoothClass.Device.COMPUTER_PALM_SIZE_PC_PDA:
			return "Computer, Palm Size PC/PDA";
		case BluetoothClass.Device.COMPUTER_SERVER:
			return "Computer, Server";
		case BluetoothClass.Device.COMPUTER_UNCATEGORIZED:
			return "Computer, Uncategorized";
		case BluetoothClass.Device.COMPUTER_WEARABLE:
			return "Computer, Wearable";
		case BluetoothClass.Device.HEALTH_BLOOD_PRESSURE:
			return "Health, Blood Pressure";
		case BluetoothClass.Device.HEALTH_DATA_DISPLAY:
			return "Health, Data Display";
		case BluetoothClass.Device.HEALTH_GLUCOSE:
			return "Health, Glucose";
		case BluetoothClass.Device.HEALTH_PULSE_OXIMETER :
			return "Health, Pulse Oximeter";
		case BluetoothClass.Device.HEALTH_PULSE_RATE 	:
			return "Health, Pulse Rate";
		case BluetoothClass.Device.HEALTH_THERMOMETER :
			return "Health, Thermometer";
		case BluetoothClass.Device.HEALTH_UNCATEGORIZED :
			return "Health, Uncategorized";
		case BluetoothClass.Device.HEALTH_WEIGHING:
			return "Health, Weighting";
		case BluetoothClass.Device.PHONE_CELLULAR:
			return "Phone, Cellular";
		case BluetoothClass.Device.PHONE_CORDLESS:
			return "Phone, Cordless";
		case BluetoothClass.Device.PHONE_ISDN:
			return "Phone, ISDN";
		case BluetoothClass.Device.PHONE_MODEM_OR_GATEWAY:
			return "Phone, Modem or Gateway";
		case BluetoothClass.Device.PHONE_SMART:
			return "Phone, Smart";
		case BluetoothClass.Device.PHONE_UNCATEGORIZED:
			return "Phone, Uncategorized";
		case BluetoothClass.Device.TOY_CONTROLLER:
			return "Toy, Controller";
		case BluetoothClass.Device.TOY_DOLL_ACTION_FIGURE:
			return "Toy, Doll/Action Figure";
		case BluetoothClass.Device.TOY_GAME:
			return "Toy, Game";
		case BluetoothClass.Device.TOY_ROBOT:
			return "Toy, Robot";
		case BluetoothClass.Device.TOY_UNCATEGORIZED:
			return "Toy, Uncategorized";
		case BluetoothClass.Device.TOY_VEHICLE:
			return "Toy, Vehicle";
		case BluetoothClass.Device.WEARABLE_GLASSES:
			return "Wearable, Glasses";
		case BluetoothClass.Device.WEARABLE_HELMET:
			return "Wearable, Helmet";
		case BluetoothClass.Device.WEARABLE_JACKET:
			return "Wearable, Jacket";
		case BluetoothClass.Device.WEARABLE_PAGER:
			return "Wearable, Pager";
		case BluetoothClass.Device.WEARABLE_UNCATEGORIZED:
			return "Wearable, Uncategorized";
		case BluetoothClass.Device.WEARABLE_WRIST_WATCH:
			return "Wearable, Wrist Watch";
		default:
			return "Unknown, Unknown (class=" + btClass +")";
		}
	}
}