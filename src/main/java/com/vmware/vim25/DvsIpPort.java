package com.vmware.vim25;

import com.vmware.vim25.DvsIpPortRange;
import com.vmware.vim25.DvsSingleIpPort;
import com.vmware.vim25.NegatableExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsIpPort")
@XmlSeeAlso({DvsIpPortRange.class, DvsSingleIpPort.class})
public class DvsIpPort extends NegatableExpression {}
