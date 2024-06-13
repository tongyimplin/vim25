package com.vmware.vim25;

import com.vmware.vim25.AlarmFilterSpecAlarmTypeByEntity;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AlarmFilterSpecAlarmTypeByEntity")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByEntity {
  ENTITY_TYPE_ALL("entityTypeAll"),
  ENTITY_TYPE_HOST("entityTypeHost"),
  ENTITY_TYPE_VM("entityTypeVm");
  
  private final String value;
  
  AlarmFilterSpecAlarmTypeByEntity(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AlarmFilterSpecAlarmTypeByEntity fromValue(String paramString) {
    for (AlarmFilterSpecAlarmTypeByEntity alarmFilterSpecAlarmTypeByEntity : values()) {
      if (alarmFilterSpecAlarmTypeByEntity.value.equals(paramString))
        return alarmFilterSpecAlarmTypeByEntity; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
