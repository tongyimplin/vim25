package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.OvfCreateImportSpecParams;
import com.vmware.vim25.OvfManagerCommonParams;
import com.vmware.vim25.OvfParseDescriptorParams;
import com.vmware.vim25.OvfValidateHostParams;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfManagerCommonParams", propOrder = {"locale", "deploymentOption", "msgBundle", "importOption"})
@XmlSeeAlso({OvfParseDescriptorParams.class, OvfCreateImportSpecParams.class, OvfValidateHostParams.class})
public class OvfManagerCommonParams extends DynamicData {
  @XmlElement(required = true)
  protected String locale;
  
  @XmlElement(required = true)
  protected String deploymentOption;
  
  protected List<KeyValue> msgBundle;
  
  protected List<String> importOption;
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
  
  public String getDeploymentOption() {
    return this.deploymentOption;
  }
  
  public void setDeploymentOption(String paramString) {
    this.deploymentOption = paramString;
  }
  
  public List<KeyValue> getMsgBundle() {
    if (this.msgBundle == null)
      this.msgBundle = new ArrayList<>(); 
    return this.msgBundle;
  }
  
  public List<String> getImportOption() {
    if (this.importOption == null)
      this.importOption = new ArrayList<>(); 
    return this.importOption;
  }
}
