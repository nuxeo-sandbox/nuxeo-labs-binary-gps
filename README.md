# About nuxeo-labs-binary-gps

<a href='https://qa.nuxeo.org/jenkins/job/Sandbox/job/sandbox_nuxeo-labs-binary-gps-master/'><img src='https://qa.nuxeo.org/jenkins/buildStatus/icon?job=Sandbox/sandbox_nuxeo-labs-binary-gps-master'></a>

This plug-in uses [exiftool](https://www.sno.phy.queensu.ca/~phil/exiftool/) with the option `-n` to extract GPS metadata in decimal format. This makes it easier to deal with positive and negative direction, and easier to integrate with services like Google Maps.

**WARNING**: The plugin fodler is named "nuxeo-labs-binary-gps", but the Marketplace Package is `nuxeo-labs-decimal-gps-metadata`

# Usage

The plugin includes a custom operation, `Document.GetGPSData`, that accepts params that correspond to the EXIF tags `GPSLongitute`, `GPSLatitude`, and `GPSPosition` (which is a [composite tag](https://sno.phy.queensu.ca/~phil/exiftool/TagNames/Composite.html)).

The values of the parameters are XPATH fields of the input document that will get these values. For example, say input document has the `gps` (custom) schema with 3 fields, `gps:DecimalLatitude`, `gps:DecimalLongitude` and `gps:DecimalPosition`. Calling theoperaiton:

```
. . .
input = Document.GetGPSData(
  input, {
    'latitudeField': 'gps:DecimalLatitude',
    'longitudeField': 'gps:DecimalLongitude',
    'positionField': 'gps:DecimalPosition'
  }
)
```

# Requirements

Building requires the following software:

* git
* maven
* exiftool

# Build

    git clone https://github.com/nuxeo-sandbox/nuxeo-labs-binary-gps
    cd nuxeo-labs-binary-gps
    mvn clean install

The Marketplace package is at `nuxeo-labs-binary-gps/nuxeo-labs-binary-gps-package/target/nuxeo-labs-binary-gps-package-{VERSION}.zip`

**WARNING**: The plugin fodler is named "nuxeo-labs-binary-gps", but the Marketplace Package is `nuxeo-labs-decimal-gps-metadata`


# Support

**These features are not part of the Nuxeo Production platform.**

These solutions are provided for inspiration and we encourage customers to use them as code samples and learning resources.

This is a moving project (no API maintenance, no deprecation process, etc.) If any of these solutions are found to be useful for the Nuxeo Platform in general, they will be integrated directly into platform, not maintained here.

# License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

# About Nuxeo

Nuxeo Platform is an open source Content Services platform, written in Java. Data can be stored in both SQL & NoSQL databases.

The development of the Nuxeo Platform is mostly done by Nuxeo employees with an open development model.

The source code, documentation, roadmap, issue tracker, testing, benchmarks are all public.

Typically, Nuxeo users build different types of information management solutions for [document management](https://www.nuxeo.com/solutions/document-management/), [case management](https://www.nuxeo.com/solutions/case-management/), and [digital asset management](https://www.nuxeo.com/solutions/dam-digital-asset-management/), use cases. It uses schema-flexible metadata & content models that allows content to be repurposed to fulfill future use cases.

More information is available at [www.nuxeo.com](https://www.nuxeo.com).
