package com.vmware.vim25;

import com.vmware.vim25.DvsNetworkRuleQualifier;
import com.vmware.vim25.DvsSystemTrafficNetworkRuleQualifier;
import com.vmware.vim25.StringExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsSystemTrafficNetworkRuleQualifier", propOrder = {"typeOfSystemTraffic"})
public class DvsSystemTrafficNetworkRuleQualifier extends DvsNetworkRuleQualifier {
  protected StringExpression typeOfSystemTraffic;
  
  public StringExpression getTypeOfSystemTraffic() {
    return this.typeOfSystemTraffic;
  }
  
  public void setTypeOfSystemTraffic(StringExpression paramStringExpression) {
    this.typeOfSystemTraffic = paramStringExpression;
  }
}
