package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.ImportHostAddFailure;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportHostAddFailure", propOrder = {"hostIp"})
public class ImportHostAddFailure extends DvsFault {
  @XmlElement(required = true)
  protected List<String> hostIp;
  
  public List<String> getHostIp() {
    if (this.hostIp == null)
      this.hostIp = new ArrayList<>(); 
    return this.hostIp;
  }
}
