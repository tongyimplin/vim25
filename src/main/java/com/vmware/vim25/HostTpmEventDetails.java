package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostTpmBootSecurityOptionEventDetails;
import com.vmware.vim25.HostTpmCommandEventDetails;
import com.vmware.vim25.HostTpmEventDetails;
import com.vmware.vim25.HostTpmOptionEventDetails;
import com.vmware.vim25.HostTpmSoftwareComponentEventDetails;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmEventDetails", propOrder = {"dataHash", "dataHashMethod"})
@XmlSeeAlso({HostTpmCommandEventDetails.class, HostTpmOptionEventDetails.class, HostTpmBootSecurityOptionEventDetails.class, HostTpmSoftwareComponentEventDetails.class})
public class HostTpmEventDetails extends DynamicData {
  @XmlElement(type = Byte.class)
  protected List<Byte> dataHash;
  
  protected String dataHashMethod;
  
  public List<Byte> getDataHash() {
    if (this.dataHash == null)
      this.dataHash = new ArrayList<>(); 
    return this.dataHash;
  }
  
  public String getDataHashMethod() {
    return this.dataHashMethod;
  }
  
  public void setDataHashMethod(String paramString) {
    this.dataHashMethod = paramString;
  }
}
