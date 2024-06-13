package com.vmware.vim25;

import com.vmware.vim25.HostTpmEventDetails;
import com.vmware.vim25.HostTpmOptionEventDetails;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmOptionEventDetails", propOrder = {"optionsFileName", "bootOptions"})
public class HostTpmOptionEventDetails extends HostTpmEventDetails {
  @XmlElement(required = true)
  protected String optionsFileName;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> bootOptions;
  
  public String getOptionsFileName() {
    return this.optionsFileName;
  }
  
  public void setOptionsFileName(String paramString) {
    this.optionsFileName = paramString;
  }
  
  public List<Byte> getBootOptions() {
    if (this.bootOptions == null)
      this.bootOptions = new ArrayList<>(); 
    return this.bootOptions;
  }
}
