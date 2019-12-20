export const parse = (data) => {

    return data.items.map((item) => {

        return {
            id:item.id,
            ...item.content.contentFields.reduce((acc, field) => {

                acc[field.name] = field.value.data || field.value.image.contentUrl;

                return acc;

            }, {}),
            dateCreated: item.content.dateCreated,
            dateModified: item.content.dateModified,
            datePublished: item.content.datePublished
        };

    });

};