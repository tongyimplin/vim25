package com.vmware.vim25;

import com.vmware.vim25.DvsIpPort;
import com.vmware.vim25.DvsSingleIpPort;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsSingleIpPort", propOrder = {"portNumber"})
public class DvsSingleIpPort extends DvsIpPort {
  protected int portNumber;
  
  public int getPortNumber() {
    return this.portNumber;
  }
  
  public void setPortNumber(int paramInt) {
    this.portNumber = paramInt;
  }
}
