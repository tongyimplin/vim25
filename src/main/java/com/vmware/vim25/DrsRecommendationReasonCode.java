package com.vmware.vim25;

import com.vmware.vim25.DrsRecommendationReasonCode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DrsRecommendationReasonCode")
@XmlEnum
public enum DrsRecommendationReasonCode {
  FAIRNESS_CPU_AVG("fairnessCpuAvg"),
  FAIRNESS_MEM_AVG("fairnessMemAvg"),
  JOINT_AFFIN("jointAffin"),
  ANTI_AFFIN("antiAffin"),
  HOST_MAINT("hostMaint");
  
  private final String value;
  
  DrsRecommendationReasonCode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DrsRecommendationReasonCode fromValue(String paramString) {
    for (DrsRecommendationReasonCode drsRecommendationReasonCode : values()) {
      if (drsRecommendationReasonCode.value.equals(paramString))
        return drsRecommendationReasonCode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
