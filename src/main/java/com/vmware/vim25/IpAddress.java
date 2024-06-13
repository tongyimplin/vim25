package com.vmware.vim25;

import com.vmware.vim25.IpRange;
import com.vmware.vim25.NegatableExpression;
import com.vmware.vim25.SingleIp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAddress")
@XmlSeeAlso({IpRange.class, SingleIp.class})
public class IpAddress extends NegatableExpression {}
