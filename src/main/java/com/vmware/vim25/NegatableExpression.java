package com.vmware.vim25;

import com.vmware.vim25.DvsIpPort;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IntExpression;
import com.vmware.vim25.IpAddress;
import com.vmware.vim25.MacAddress;
import com.vmware.vim25.NegatableExpression;
import com.vmware.vim25.StringExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegatableExpression", propOrder = {"negate"})
@XmlSeeAlso({IntExpression.class, MacAddress.class, IpAddress.class, StringExpression.class, DvsIpPort.class})
public class NegatableExpression extends DynamicData {
  protected Boolean negate;
  
  public Boolean isNegate() {
    return this.negate;
  }
  
  public void setNegate(Boolean paramBoolean) {
    this.negate = paramBoolean;
  }
}
