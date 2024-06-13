package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDigestInfo;
import com.vmware.vim25.HostTpmDigestInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDigestInfo", propOrder = {"digestMethod", "digestValue", "objectName"})
@XmlSeeAlso({HostTpmDigestInfo.class})
public class HostDigestInfo extends DynamicData {
  @XmlElement(required = true)
  protected String digestMethod;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> digestValue;
  
  protected String objectName;
  
  public String getDigestMethod() {
    return this.digestMethod;
  }
  
  public void setDigestMethod(String paramString) {
    this.digestMethod = paramString;
  }
  
  public List<Byte> getDigestValue() {
    if (this.digestValue == null)
      this.digestValue = new ArrayList<>(); 
    return this.digestValue;
  }
  
  public String getObjectName() {
    return this.objectName;
  }
  
  public void setObjectName(String paramString) {
    this.objectName = paramString;
  }
}
