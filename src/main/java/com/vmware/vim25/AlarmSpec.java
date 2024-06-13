package com.vmware.vim25;

import com.vmware.vim25.AlarmAction;
import com.vmware.vim25.AlarmExpression;
import com.vmware.vim25.AlarmInfo;
import com.vmware.vim25.AlarmSetting;
import com.vmware.vim25.AlarmSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmSpec", propOrder = {"name", "systemName", "description", "enabled", "expression", "action", "actionFrequency", "setting"})
@XmlSeeAlso({AlarmInfo.class})
public class AlarmSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected String systemName;
  
  @XmlElement(required = true)
  protected String description;
  
  protected boolean enabled;
  
  @XmlElement(required = true)
  protected AlarmExpression expression;
  
  protected AlarmAction action;
  
  protected Integer actionFrequency;
  
  protected AlarmSetting setting;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getSystemName() {
    return this.systemName;
  }
  
  public void setSystemName(String paramString) {
    this.systemName = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public AlarmExpression getExpression() {
    return this.expression;
  }
  
  public void setExpression(AlarmExpression paramAlarmExpression) {
    this.expression = paramAlarmExpression;
  }
  
  public AlarmAction getAction() {
    return this.action;
  }
  
  public void setAction(AlarmAction paramAlarmAction) {
    this.action = paramAlarmAction;
  }
  
  public Integer getActionFrequency() {
    return this.actionFrequency;
  }
  
  public void setActionFrequency(Integer paramInteger) {
    this.actionFrequency = paramInteger;
  }
  
  public AlarmSetting getSetting() {
    return this.setting;
  }
  
  public void setSetting(AlarmSetting paramAlarmSetting) {
    this.setting = paramAlarmSetting;
  }
}
