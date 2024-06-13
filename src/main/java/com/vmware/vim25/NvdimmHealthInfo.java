package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmHealthInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmHealthInfo", propOrder = {"healthStatus", "healthInformation", "stateFlagInfo", "dimmTemperature", "dimmTemperatureThreshold", "spareBlocksPercentage", "spareBlockThreshold", "dimmLifespanPercentage", "esTemperature", "esTemperatureThreshold", "esLifespanPercentage"})
public class NvdimmHealthInfo extends DynamicData {
  @XmlElement(required = true)
  protected String healthStatus;
  
  @XmlElement(required = true)
  protected String healthInformation;
  
  protected List<String> stateFlagInfo;
  
  protected int dimmTemperature;
  
  protected int dimmTemperatureThreshold;
  
  protected int spareBlocksPercentage;
  
  protected int spareBlockThreshold;
  
  protected int dimmLifespanPercentage;
  
  protected Integer esTemperature;
  
  protected Integer esTemperatureThreshold;
  
  protected Integer esLifespanPercentage;
  
  public String getHealthStatus() {
    return this.healthStatus;
  }
  
  public void setHealthStatus(String paramString) {
    this.healthStatus = paramString;
  }
  
  public String getHealthInformation() {
    return this.healthInformation;
  }
  
  public void setHealthInformation(String paramString) {
    this.healthInformation = paramString;
  }
  
  public List<String> getStateFlagInfo() {
    if (this.stateFlagInfo == null)
      this.stateFlagInfo = new ArrayList<>(); 
    return this.stateFlagInfo;
  }
  
  public int getDimmTemperature() {
    return this.dimmTemperature;
  }
  
  public void setDimmTemperature(int paramInt) {
    this.dimmTemperature = paramInt;
  }
  
  public int getDimmTemperatureThreshold() {
    return this.dimmTemperatureThreshold;
  }
  
  public void setDimmTemperatureThreshold(int paramInt) {
    this.dimmTemperatureThreshold = paramInt;
  }
  
  public int getSpareBlocksPercentage() {
    return this.spareBlocksPercentage;
  }
  
  public void setSpareBlocksPercentage(int paramInt) {
    this.spareBlocksPercentage = paramInt;
  }
  
  public int getSpareBlockThreshold() {
    return this.spareBlockThreshold;
  }
  
  public void setSpareBlockThreshold(int paramInt) {
    this.spareBlockThreshold = paramInt;
  }
  
  public int getDimmLifespanPercentage() {
    return this.dimmLifespanPercentage;
  }
  
  public void setDimmLifespanPercentage(int paramInt) {
    this.dimmLifespanPercentage = paramInt;
  }
  
  public Integer getEsTemperature() {
    return this.esTemperature;
  }
  
  public void setEsTemperature(Integer paramInteger) {
    this.esTemperature = paramInteger;
  }
  
  public Integer getEsTemperatureThreshold() {
    return this.esTemperatureThreshold;
  }
  
  public void setEsTemperatureThreshold(Integer paramInteger) {
    this.esTemperatureThreshold = paramInteger;
  }
  
  public Integer getEsLifespanPercentage() {
    return this.esLifespanPercentage;
  }
  
  public void setEsLifespanPercentage(Integer paramInteger) {
    this.esLifespanPercentage = paramInteger;
  }
}
