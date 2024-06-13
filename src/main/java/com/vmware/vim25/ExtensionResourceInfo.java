package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionResourceInfo;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionResourceInfo", propOrder = {"locale", "module", "data"})
public class ExtensionResourceInfo extends DynamicData {
  @XmlElement(required = true)
  protected String locale;
  
  @XmlElement(required = true)
  protected String module;
  
  @XmlElement(required = true)
  protected List<KeyValue> data;
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
  
  public String getModule() {
    return this.module;
  }
  
  public void setModule(String paramString) {
    this.module = paramString;
  }
  
  public List<KeyValue> getData() {
    if (this.data == null)
      this.data = new ArrayList<>(); 
    return this.data;
  }
}
