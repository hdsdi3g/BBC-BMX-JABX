Use with Java and JAXB API the informations from MXF File from [BMXLib Tools](https://sourceforge.net/projects/bmxlib/).

You can see the [Javadoc](https://hdsdi3g.github.io/BBC-BMX-JAXB/) (you can ignore the french comments, it's auto generated).

Usage, with Java 8:
```java
    import javax.xml.bind.JAXBContext;
    import javax.xml.bind.JAXBException;
    import javax.xml.bind.Unmarshaller;
    import uk.co.bbc.rd.bmx.Bmx;
```

Start `mxf2raw --info-format xml source-file.xml` and get a XML file to give to Java.

And import the XML:
```java
// Load it in this InputStream
InputStream os = new FileInputStream("source-file.xml");

// Init JAXB
JAXBContext jc = JAXBContext.newInstance("uk.co.bbc.rd.bmx");
Unmarshaller unmarshaller = jc.createUnmarshaller();

// Enjoy your BMX Object !
Bmx b = (Bmx) unmarshaller.unmarshal(os);
```
		
Examples:

Get the start time code: `b.getClip().getStartTimecodes().getPhysicalSource().getValue();`

Get the Clip name: `b.getFiles().getFile().get(0).getMaterialPackages().getMaterialPackage().get(0).getName();`

Code automatically generated with `xjc -p uk.co.bbc.rd.bmx mxf2raw_info.xsd`, and some problems with vars names are corrected.
